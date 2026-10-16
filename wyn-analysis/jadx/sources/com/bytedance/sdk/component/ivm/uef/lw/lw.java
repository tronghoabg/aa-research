package com.bytedance.sdk.component.ivm.uef.lw;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class lw implements Comparable<lw>, Runnable {
    private String yo;
    private int uef = 5;

    /* renamed from: oa, reason: collision with root package name */
    private String f24989oa = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public lw(String str) {
        this.yo = str;
    }

    public void uef(int i5) {
        this.uef = i5;
    }

    public int uef() {
        return this.uef;
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(lw lwVar) {
        if (uef() < lwVar.uef()) {
            return 1;
        }
        return uef() >= lwVar.uef() ? -1 : 0;
    }
}
