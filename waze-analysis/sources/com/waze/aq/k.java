package com.waze.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f15469a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f15470b;

    private k(String str, Integer num) {
        this.f15469a = str;
        this.f15470b = num;
    }

    protected Integer a() {
        return this.f15470b;
    }

    public final String b() {
        String str;
        Integer numA = a();
        if (numA != null) {
            str = "_" + numA.intValue();
        } else {
            str = "";
        }
        return this.f15469a.concat(str);
    }

    public /* synthetic */ k(String str, Integer num, byte[] bArr) {
        this(str, num);
    }

    public /* synthetic */ k() {
        this("timeout", null);
    }
}
