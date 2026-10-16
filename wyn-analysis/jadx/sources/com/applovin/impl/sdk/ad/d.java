package com.applovin.impl.sdk.ad;

import com.applovin.impl.i5;
import org.json.JSONArray;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC4035a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f22911b;

    public /* synthetic */ d(b bVar, int i5) {
        this.f22910a = i5;
        this.f22911b = bVar;
    }

    @Override // t.InterfaceC4035a
    public final Object apply(Object obj) {
        switch (this.f22910a) {
            case 0:
                return this.f22911b.i((i5) obj);
            case 1:
                return this.f22911b.d((i5) obj);
            case 2:
                return this.f22911b.g((i5) obj);
            case 3:
                return this.f22911b.k((i5) obj);
            case 4:
                return this.f22911b.e((i5) obj);
            case 5:
                return this.f22911b.b((i5) obj);
            case 6:
                return this.f22911b.o((i5) obj);
            case 7:
                return this.f22911b.j((i5) obj);
            case 8:
                return this.f22911b.f((i5) obj);
            case 9:
                return this.f22911b.a((JSONArray) obj);
            case 10:
                return this.f22911b.p((i5) obj);
            case 11:
                return this.f22911b.c((i5) obj);
            default:
                return this.f22911b.a((i5) obj);
        }
    }
}
