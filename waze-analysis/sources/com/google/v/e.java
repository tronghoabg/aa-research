package com.google.v;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class e implements fo {

    /* renamed from: a, reason: collision with root package name */
    private static final de f12904a = de.f12840a;

    private static final void f(fi fiVar) throws eu {
        gd gdVarNewUninitializedMessageException;
        if (fiVar == null || fiVar.isInitialized()) {
            return;
        }
        if (fiVar instanceof c) {
            gdVarNewUninitializedMessageException = ((c) fiVar).newUninitializedMessageException();
        } else {
            if (fiVar instanceof d) {
                throw null;
            }
            gdVarNewUninitializedMessageException = new gd();
        }
        throw gdVarNewUninitializedMessageException.a();
    }

    @Override // com.google.v.fo
    public final /* bridge */ /* synthetic */ Object a(z zVar, de deVar) throws eu {
        fi fiVar = (fi) e(zVar, deVar);
        f(fiVar);
        return fiVar;
    }

    @Override // com.google.v.fo
    public final /* synthetic */ Object b(InputStream inputStream, de deVar) throws eu {
        z zVarX = z.X(inputStream);
        fi fiVar = (fi) e(zVarX, deVar);
        zVarX.E(0);
        f(fiVar);
        return fiVar;
    }

    @Override // com.google.v.fo
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        return d(bArr, bArr.length, f12904a);
    }

    public fi d(byte[] bArr, int i2, de deVar) {
        throw null;
    }
}
