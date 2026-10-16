package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes4.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f32538a;

    /* renamed from: b, reason: collision with root package name */
    private int f32539b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f32540c;

    public ao(Context context, int i5, Object[] objArr) {
        this.f32538a = context;
        this.f32539b = i5;
        this.f32540c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f32539b == 222) {
                ak.a(this.f32538a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f32539b, this.f32538a, this.f32540c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f32538a, this.f32539b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
