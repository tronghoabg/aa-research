package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.T;
import n3.InterfaceC3591c;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC3591c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17702b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f17701a = i5;
        this.f17702b = obj;
    }

    @Override // n3.InterfaceC3591c
    public final Bundle a() {
        switch (this.f17701a) {
            case 0:
                return ComponentActivity.j((ComponentActivity) this.f17702b);
            default:
                return T.a((T) this.f17702b);
        }
    }
}
