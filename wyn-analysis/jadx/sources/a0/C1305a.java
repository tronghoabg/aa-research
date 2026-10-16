package a0;

import U1.AbstractC0832b;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305a implements InterfaceC1306b {

    /* renamed from: a, reason: collision with root package name */
    public final C4188n f17092a;

    /* renamed from: b, reason: collision with root package name */
    public final C1310f f17093b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f17094c;

    public C1305a(C4188n c4188n, C1310f autofillTree) {
        AbstractC3340k.e(autofillTree, "autofillTree");
        this.f17092a = c4188n;
        this.f17093b = autofillTree;
        AutofillManager autofillManagerI = AbstractC0832b.i(c4188n.getContext().getSystemService(AbstractC0832b.m()));
        if (autofillManagerI == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f17094c = autofillManagerI;
        c4188n.setImportantForAutofill(1);
    }
}
