from menu import menu
from views import create_note, save_note_in_list, delete, read_all, read_on_index, edit
from exeptions import is_empty


def main():
    array = []
    print("Hello!")
    action = True

    while action:
        menu()
        action = input("Введите номер действия: ")

        if action == "7":
            print("Работа завершена")
            action = False

        if action == "1":
            title = input("Введите название заметки: ")
            description = input("Введите содержание заметки: ")
            note = create_note(title, description)
            print(note.signal())

        if action == "2":
            try:
                save_note_in_list(array, note)
            except Exception:
                is_empty()

        if action == "3":
            read_all(array)

        if action == "4":
            read_on_index(array)

        if action == "5":
            edit(array)

        if action == "6":
            try:
                delete(array)
            except Exception:
                is_empty()


if __name__ == "__main__":
    main()
