package b2;

import f2.InterfaceC2551a;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements InterfaceC2551a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19230a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19231b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19232c;

    public m(String str, List list, boolean z2) {
        this.f19230a = str;
        this.f19231b = DesugarCollections.unmodifiableList(list);
        this.f19232c = z2;
    }
}
