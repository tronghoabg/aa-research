package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.settings.bk;
import com.waze.settings.de;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class n extends com.waze.settings.tree.n {
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(java.lang.String r8, java.lang.String r9, com.waze.ui.ac.n r10, com.waze.settings.tree.d r11, java.util.List r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 8
            if (r0 == 0) goto L8
            com.waze.settings.tree.c r11 = com.waze.settings.tree.c.f37530a
            com.waze.settings.tree.d r11 = (com.waze.settings.tree.d) r11
        L8:
            r4 = r11
            r11 = r13 & 16
            r0 = 0
            if (r11 == 0) goto L12
            com.waze.settings.bk r11 = com.waze.settings.bk.f36871a
            r5 = r11
            goto L13
        L12:
            r5 = r0
        L13:
            r11 = r13 & 32
            if (r11 == 0) goto L1d
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r0 = r7
            goto L22
        L1d:
            r6 = r12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
        L22:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.tree.d.n.<init>(java.lang.String, java.lang.String, com.waze.ui.ac.n, com.waze.settings.tree.d, java.util.List, int):void");
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, bk bkVar, List list) {
        super(str, str2, nVar, dVar, bkVar, list);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(dVar, "iconSource");
        x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    }
}
