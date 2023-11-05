from note import Note
from exeptions import is_empty


def create_note(title, description):
    note_one = Note(title, description)
    return note_one


def save_note_in_list(list, note):
    list.append(note)
    print("Заметка сохранена")


def delete(list):
    list.remove(list[read_on_index(list)])
    print("Заметка удалена\n")


def read_all(list):
    count = 1
    if len(list) > 0:
        print("Список заметок:")
        for i in list:
            print(f"{count} - " + i.title + "\n")
            count += 1
    else:
        print("Список заметок пуст\n")


def read_on_index(list):
    try:
        read_all(list)
        index = int(input("Введите номер заметки: \n"))
        print("\n___________________________________________\n"
              "Название заметки - " + list[index - 1].title +
              "\nОписание: " + list[index - 1].description + "\n"
              "___________________________________________\n")
        return index - 1
    except IndexError:
        is_empty()


def edit(list):
    try:
        buf = read_on_index(list)
        action = input("1 - для редактирования названия \n"
                       "2 - для редактирвоания описания \n"
                       "3 - вернуться назад \n")
        if action == "1":
            new_title = input("Внесите правки названия: ")
            note = list[buf]
            note.title = new_title  # находим заметку в списке, обращаемся к ее названию, меняем его
            delete(list, note)  # Удалить страую заметку
            save_note_in_list(list, note)
        if action == "2":
            new_description = input("Внесите правки описания: ")
            note = list[buf]
            note.description = new_description
            delete(list, note)  # Удалить страую заметку
            save_note_in_list(list, note)
        if action == "3":
            return
    except Exception:
        print("Введите корректный номер")
