
/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListDto<E> {

    private final List<E> content;

    public ListDto() {
        content = new ArrayList<>();
    }

    public ListDto(List<E> content) {
        this.content = content;
    }

    public void add(E element) {
        content.add(element);
    }

    public E get(int index) {
        return content.get(index);
    }

    public int size() {
        return content.size();
    }
}
