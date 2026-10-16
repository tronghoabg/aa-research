package u1;

import java.io.File;
import java.io.FileOutputStream;
import lf.AbstractC3464c;

/* renamed from: u1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4208F extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46436a;

    /* renamed from: b, reason: collision with root package name */
    public File f46437b;

    /* renamed from: c, reason: collision with root package name */
    public FileOutputStream f46438c;

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f46439d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4209G f46441f;

    /* renamed from: g, reason: collision with root package name */
    public int f46442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4208F(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46441f = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46440e = obj;
        this.f46442g |= Integer.MIN_VALUE;
        return this.f46441f.j(null, this);
    }
}
