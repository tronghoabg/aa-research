package com.google.l.d;

import com.google.l.b.a.l;
import com.google.l.b.m;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends m {
    @Override // com.google.l.b.m
    public final void a(b bVar) throws IOException {
        int i2;
        if (bVar instanceof l) {
            ((l) bVar).n();
            return;
        }
        int iS = bVar.f12422a;
        if (iS == 0) {
            iS = bVar.s();
        }
        if (iS == 13) {
            i2 = 9;
        } else if (iS == 12) {
            i2 = 8;
        } else {
            if (iS != 14) {
                throw bVar.z("a name");
            }
            i2 = 10;
        }
        bVar.f12422a = i2;
    }
}
