package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload;
import com.google.android.apps.auto.components.media.repository.suggestion.MediaSuggestionPlaybackPayload;

/* loaded from: classes2.dex */
public final class lps implements lpt {
    public final orz a;

    public lps(orz orzVar) {
        this.a = orzVar;
    }

    @Override // defpackage.lpt
    public final ComponentName a() {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        osd osdVar = osjVar.e;
        if (osdVar == null) {
            osdVar = osd.a;
        }
        return new ComponentName(osdVar.e, osdVar.f);
    }

    @Override // defpackage.lpt
    public final Bitmap b() {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        osd osdVar = osjVar.e;
        if (osdVar == null) {
            osdVar = osd.a;
        }
        if ((osdVar.b & 2) == 0) {
            return null;
        }
        byte[] bArrD = osdVar.d.D();
        return BitmapFactory.decodeByteArray(bArrD, 0, bArrD.length);
    }

    @Override // defpackage.lpt
    public final Uri c() {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        osd osdVar = osjVar.e;
        if (osdVar == null) {
            osdVar = osd.a;
        }
        if ((osdVar.b & 1) != 0) {
            return Uri.parse(osdVar.c);
        }
        return null;
    }

    @Override // defpackage.lpt
    public final MediaSuggestionPlaybackPayload d() {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        ory oryVar = osjVar.h;
        if (oryVar == null) {
            oryVar = ory.a;
        }
        return new AssistantMediaSuggestionPlaybackPayload(oryVar);
    }

    @Override // defpackage.lpt
    public final CharSequence e(Context context) {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        osk oskVar = osjVar.g;
        if (oskVar == null) {
            oskVar = osk.a;
        }
        return kzd.m(context, oskVar);
    }

    @Override // defpackage.lpt
    public final CharSequence f(Context context) {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        osk oskVar = osjVar.f;
        if (oskVar == null) {
            oskVar = osk.a;
        }
        return kzd.m(context, oskVar);
    }

    public final String toString() {
        osj osjVar = this.a.e;
        if (osjVar == null) {
            osjVar = osj.a;
        }
        StringBuilder sb = new StringBuilder("AssistantMediaSuggestion{ ComponentName: ");
        sb.append(a());
        sb.append(", Title: ");
        osk oskVar = osjVar.f;
        if (oskVar == null) {
            oskVar = osk.a;
        }
        sb.append(oskVar.b);
        sb.append(", Subtitle: ");
        osk oskVar2 = osjVar.g;
        if (oskVar2 == null) {
            oskVar2 = osk.a;
        }
        sb.append(oskVar2.b);
        sb.append("}");
        return sb.toString();
    }
}
