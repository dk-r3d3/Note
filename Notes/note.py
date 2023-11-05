# класс заметки создать

class Note:
    def __init__(self, title,  description):
        self.title = title
        self.description = description

    def signal(self):
        return f"Заметка <{self.title}> создана"
