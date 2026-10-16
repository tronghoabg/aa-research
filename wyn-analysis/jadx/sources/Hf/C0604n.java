package Hf;

import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0604n extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5163a;

    /* renamed from: b, reason: collision with root package name */
    public int f5164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0605o f5165c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0603m f5166d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f5167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604n(C0605o c0605o, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5165c = c0605o;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5163a = obj;
        this.f5164b |= Integer.MIN_VALUE;
        return this.f5165c.collect(null, this);
    }
}
