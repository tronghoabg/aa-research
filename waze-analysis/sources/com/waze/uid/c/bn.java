package com.waze.uid.c;

import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bn implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be f44292a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44293b;

    public /* synthetic */ bn(be beVar, int i2) {
        this.f44293b = i2;
        this.f44292a = beVar;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f44293b == 0) {
            InstallParameters.Result result = (InstallParameters.Result) obj;
            h.g.b.x.f(result, "result");
            this.f44292a.j(new com.waze.uid.state_impl.g.s(result, (InstallParameters.Community) obj2));
            return h.ab.f48028a;
        }
        String str = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        h.g.b.x.f(str, "text");
        this.f44292a.j(new com.waze.uid.state_impl.username_login.q(str, iIntValue));
        return h.ab.f48028a;
    }
}
