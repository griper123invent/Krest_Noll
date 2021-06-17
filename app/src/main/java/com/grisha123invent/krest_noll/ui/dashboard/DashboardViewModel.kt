package com.grisha123invent.krest_noll.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _glav_1 = MutableLiveData<String>().apply {
        value = "Если вы играете 3 × 3: "
    }
    val glav_1: LiveData<String> = _glav_1
    private val _glav_2 = MutableLiveData<String>().apply {
        value = "Если вы играете 5 × 5: "
    }
    val glav_2: LiveData<String> = _glav_2
    private val _glav_3 = MutableLiveData<String>().apply {
        value = "Если вы играете 6 × 6: "
    }
    val glav_3: LiveData<String> = _glav_3
    private val _glav_4 = MutableLiveData<String>().apply {
        value = "Если вы играете 7 × 7: "
    }
    val glav_4: LiveData<String> = _glav_4
    private val _glav_5 = MutableLiveData<String>().apply {
        value = "Если вы играете 8 × 8: "
    }
    val glav_5: LiveData<String> = _glav_5
    private val _glav_6 = MutableLiveData<String>().apply {
        value = "Если вы играете 9 × 9: "
    }
    val glav_6: LiveData<String> = _glav_6
    private val _glav_7 = MutableLiveData<String>().apply {
        value = "Если вы играете 10 × 10: "
    }
    val glav_7: LiveData<String> = _glav_7
    private val _glav_8 = MutableLiveData<String>().apply {
        value = "Если вы играете 11 × 11: "
    }
    val glav_8: LiveData<String> = _glav_8
    private val _glav_9 = MutableLiveData<String>().apply {
        value = "Если вы играете 12 × 12: "
    }
    val glav_9: LiveData<String> = _glav_9
    private val _glav_10 = MutableLiveData<String>().apply {
        value = "Если вы играете 13 × 13: "
    }
    val glav_10: LiveData<String> = _glav_10
    private val _glav_11 = MutableLiveData<String>().apply {
        value = "Если вы играете 14 × 14: "
    }
    val glav_11: LiveData<String> = _glav_11
    private val _glav_12 = MutableLiveData<String>().apply {
        value = "Если вы играете 15 × 15: "
    }
    val glav_12: LiveData<String> = _glav_12
    private val _glav_13 = MutableLiveData<String>().apply {
        value = "Если вы играете 16 × 16: "
    }
    val glav_13: LiveData<String> = _glav_13
    private val _glav_14 = MutableLiveData<String>().apply {
        value = "Если вы играете 17 × 17: "
    }
    val glav_14: LiveData<String> = _glav_14
    private val _glav_15 = MutableLiveData<String>().apply {
        value = "Если вы играете 18 × 18: "
    }
    val glav_15: LiveData<String> = _glav_15
    private val _glav_16 = MutableLiveData<String>().apply {
        value = "Если вы играете 19 × 19: "
    }
    val glav_16: LiveData<String> = _glav_16
    private val _glav_17 = MutableLiveData<String>().apply {
        value = "Если вы играете 20 × 20: "
    }
    val glav_17: LiveData<String> = _glav_17
    private val _glav_18 = MutableLiveData<String>().apply {
        value = "Если вы играете 21 × 21: "
    }
    val glav_18: LiveData<String> = _glav_18

    private val _podr_1 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 3 х 3 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 3 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_1: LiveData<String> = _podr_1
    private val _podr_2 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 5 х 5 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 4 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_2: LiveData<String> = _podr_2
    private val _podr_3 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 6 х 6 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 5 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_3: LiveData<String> = _podr_3
    private val _podr_4 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 7 х 7 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 6 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_4: LiveData<String> = _podr_4
    private val _podr_5 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 8 х 8 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 6 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_5: LiveData<String> = _podr_5
    private val _podr_6 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 9 х 9 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 7 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_6: LiveData<String> = _podr_6
    private val _podr_7 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 10 х 10 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 8 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_7: LiveData<String> = _podr_7
    private val _podr_8 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 11 х 11 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 8 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_8: LiveData<String> = _podr_8
    private val _podr_9 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 12 х 12 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 9 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_9: LiveData<String> = _podr_9
    private val _podr_10 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 13 х 13 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 9 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_10: LiveData<String> = _podr_10
    private val _podr_11 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 14 х 14 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 9 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_11: LiveData<String> = _podr_11
    private val _podr_12 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 15 х 15 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 10 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_12: LiveData<String> = _podr_12
    private val _podr_13 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 16 х 16 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 11 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_13: LiveData<String> = _podr_13
    private val _podr_14 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 17 х 17 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 12 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."

    }
    val podr_14: LiveData<String> = _podr_14
    private val _podr_15 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 18 х 18 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 13 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_15: LiveData<String> = _podr_15
    private val _podr_16 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 19 х 19 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 14 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_16: LiveData<String> = _podr_16
    private val _podr_17 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 20 х 20 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 15 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_17: LiveData<String> = _podr_17
    private val _podr_18 = MutableLiveData<String>().apply {
        value = "Игроки по очереди ставят на свободные клетки поля 21 х 21 знаки (один всегда крестики, другой всегда нолики). Первый, выстроивший в ряд 16 своих фигур по вертикали, горизонтали или диагонали, выигрывает. Первый ход делает игрок, ставящий крестики."
    }
    val podr_18: LiveData<String> = _podr_18

}