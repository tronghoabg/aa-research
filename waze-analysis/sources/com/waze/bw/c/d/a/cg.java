package com.waze.bw.c.d.a;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cg implements LinkInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17926a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17927b;

    public /* synthetic */ cg(Object obj, int i2) {
        this.f17927b = i2;
        this.f17926a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.a, java.lang.Object] */
    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i2 = this.f17927b;
        if (i2 == 0) {
            h.g.b.x.f(linkAnnotation, "it");
            this.f17926a.invoke();
            return;
        }
        if (i2 == 1) {
            h.g.b.x.f(linkAnnotation, "it");
            this.f17926a.invoke();
            return;
        }
        if (i2 != 2) {
            h.g.b.x.f(linkAnnotation, "link");
            this.f17926a.invoke();
            return;
        }
        h.g.b.x.f(linkAnnotation, "link");
        LinkAnnotation.Url url = linkAnnotation instanceof LinkAnnotation.Url ? (LinkAnnotation.Url) linkAnnotation : null;
        String url2 = url != null ? url.getUrl() : null;
        if (url2 != null) {
            Object obj = this.f17926a;
            int iHashCode = url2.hashCode();
            if (iHashCode == -1519676652) {
                if (url2.equals("https://www.waze.com/learnMoreUrl/placeholder/")) {
                    ((com.waze.ui.s.d) obj).f().invoke();
                }
            } else if (iHashCode == -467727179) {
                if (url2.equals("https://www.waze.com/privacyPolicyUrl/placeholder/")) {
                    ((com.waze.ui.s.d) obj).g().invoke();
                }
            } else if (iHashCode == 1877025624 && url2.equals("https://www.waze.com/privacyPolicyUrl/placeholder/isv/")) {
                ((com.waze.ui.s.d) obj).e().invoke();
            }
        }
    }
}
