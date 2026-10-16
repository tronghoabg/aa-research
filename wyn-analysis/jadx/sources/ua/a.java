package ua;

import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f46746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i5) {
        super(str);
        AbstractC1732v.g(str, "Provided message must not be empty.");
        this.f46746a = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Exception exc) {
        super(str, exc);
        AbstractC1732v.g(str, "Provided message must not be empty.");
        this.f46746a = 13;
    }
}
