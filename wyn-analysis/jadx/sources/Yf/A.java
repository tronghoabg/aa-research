package Yf;

import ef.C2518b;
import java.util.LinkedHashMap;
import lf.AbstractC3462a;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class A extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C2518b f16799a;

    /* renamed from: b, reason: collision with root package name */
    public B f16800b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f16801c;

    /* renamed from: d, reason: collision with root package name */
    public String f16802d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f16803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f16804f;

    /* renamed from: g, reason: collision with root package name */
    public int f16805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5, AbstractC3462a abstractC3462a) {
        super(abstractC3462a);
        this.f16804f = b5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f16803e = obj;
        this.f16805g |= Integer.MIN_VALUE;
        return B.a(this.f16804f, null, this);
    }
}
