package com.google.d.f;

import j$.util.Objects;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends o implements x, h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, Level level) {
        super(level);
        Objects.requireNonNull(iVar);
        this.f7846a = iVar;
    }

    @Override // com.google.d.f.o
    protected final com.google.d.f.e.d a() {
        return com.google.d.f.e.b.b();
    }

    @Override // com.google.d.f.o
    protected final boolean b(s sVar) {
        com.google.d.f.b.k kVarJ = j();
        int iA = kVarJ.a();
        int i2 = 0;
        while (true) {
            if (i2 >= iA) {
                break;
            }
            if (kVarJ.b(i2).f() != "eye3tag") {
                i2++;
            } else if (kVarJ.c(m.f7848a) == null) {
                aa aaVar = m.f7856i;
                if (kVarJ.c(aaVar) == null) {
                    n(aaVar, ak.SMALL);
                }
            }
        }
        return super.b(sVar);
    }

    @Override // com.google.d.f.o
    protected final /* synthetic */ a c() {
        return this.f7846a;
    }

    @Override // com.google.d.f.o
    protected final /* bridge */ /* synthetic */ x d() {
        return this;
    }
}
