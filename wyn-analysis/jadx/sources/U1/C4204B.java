package u1;

import java.io.FileInputStream;
import lf.AbstractC3464c;

/* renamed from: u1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4204B extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46417a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f46418b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4209G f46420d;

    /* renamed from: e, reason: collision with root package name */
    public int f46421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4204B(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46420d = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46419c = obj;
        this.f46421e |= Integer.MIN_VALUE;
        return this.f46420d.g(this);
    }
}
