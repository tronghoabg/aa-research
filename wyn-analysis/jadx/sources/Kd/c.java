package Kd;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f6740a;

    public final int a(int i5) {
        return ((int[]) this.f6740a.get(i5 / 768))[i5 % 768];
    }

    public final void b(int i5, int i10) {
        ((int[]) this.f6740a.get(i5 / 768))[i5 % 768] = i10;
    }
}
