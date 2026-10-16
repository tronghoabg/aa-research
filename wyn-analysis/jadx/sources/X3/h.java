package X3;

import android.graphics.Bitmap;
import h4.C2774a;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class h extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public k f16096a;

    /* renamed from: b, reason: collision with root package name */
    public C2774a f16097b;

    /* renamed from: c, reason: collision with root package name */
    public h4.h f16098c;

    /* renamed from: d, reason: collision with root package name */
    public c f16099d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f16100e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f16101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f16102g;

    /* renamed from: h, reason: collision with root package name */
    public int f16103h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f16102g = kVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f16101f = obj;
        this.f16103h |= Integer.MIN_VALUE;
        return k.a(this.f16102g, null, 0, this);
    }
}
