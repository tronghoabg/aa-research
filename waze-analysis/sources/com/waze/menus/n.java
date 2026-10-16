package com.waze.menus;

import android.widget.Filter;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends Filter {

    /* renamed from: a, reason: collision with root package name */
    private final m f29742a;

    /* renamed from: b, reason: collision with root package name */
    private final o f29743b;

    /* renamed from: c, reason: collision with root package name */
    private p f29744c;

    n(m mVar, o oVar) {
        this.f29742a = mVar;
        this.f29743b = oVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) throws Throwable {
        p pVar;
        synchronized (this) {
            String string = charSequence == null ? "" : charSequence.toString();
            m mVar = this.f29742a;
            pVar = new p(string, mVar.b(), mVar.a(), false, false, this.f29743b);
            this.f29744c = pVar;
        }
        List listC = pVar.c();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = listC;
        filterResults.count = listC.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        p pVar;
        synchronized (this) {
            pVar = this.f29744c;
        }
        if (charSequence == null || !charSequence.toString().equals(pVar.f29745a)) {
            return;
        }
        p.d(pVar, (List) filterResults.values);
    }
}
