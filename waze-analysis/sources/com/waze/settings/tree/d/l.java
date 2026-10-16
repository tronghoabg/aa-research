package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class l extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, com.waze.ui.ac.n nVar, boolean z) {
        super(str, bk.f36880j, null, nVar, null, null, null, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL);
        x.f(str, TtmlNode.ATTR_ID);
        this.f37552a = z;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final boolean c() {
        return this.f37552a;
    }

    public /* synthetic */ l(String str, com.waze.ui.ac.n nVar) {
        this(str, nVar, false);
    }
}
