package com.waze.sharedrive.g;

import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final String f38624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38625b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f38626c;

    /* renamed from: d, reason: collision with root package name */
    private final am f38627d;

    public ah(String str, String str2, com.waze.ui.ac.i iVar, am amVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(amVar, NotificationCompat.CATEGORY_STATUS);
        this.f38624a = str;
        this.f38625b = str2;
        this.f38626c = iVar;
        this.f38627d = amVar;
    }

    public final am a() {
        return this.f38627d;
    }

    public final com.waze.ui.ac.i b() {
        return this.f38626c;
    }

    public final String c() {
        return this.f38624a;
    }

    public final String d() {
        return this.f38625b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f38624a, ahVar.f38624a) && h.g.b.x.n(this.f38625b, ahVar.f38625b) && h.g.b.x.n(this.f38626c, ahVar.f38626c) && h.g.b.x.n(this.f38627d, ahVar.f38627d);
    }

    public final int hashCode() {
        int iHashCode = this.f38624a.hashCode() * 31;
        String str = this.f38625b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f38626c;
        return ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f38627d.hashCode();
    }

    public final String toString() {
        return "ParticipantPreviewData(id=" + this.f38624a + ", name=" + this.f38625b + ", image=" + this.f38626c + ", status=" + this.f38627d + ")";
    }
}
