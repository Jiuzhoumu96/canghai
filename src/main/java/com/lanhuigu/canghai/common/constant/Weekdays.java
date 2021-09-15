package com.lanhuigu.canghai.common.constant;

/**
 * @author: HeChengyao
 * @date: 2021/9/15 15:02
 */
public enum Weekdays {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 0);

    private String name ;
    private int index ;

    Weekdays(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Weekdays{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
