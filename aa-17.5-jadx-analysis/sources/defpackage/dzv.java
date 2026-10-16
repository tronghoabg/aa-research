package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes2.dex */
final class dzv implements dzu {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public dzv(dzs dzsVar) {
        ClipData clipData = dzsVar.a;
        ebe.m(clipData);
        this.a = clipData;
        this.b = dzsVar.b;
        this.c = dzsVar.c;
        this.d = dzsVar.d;
        this.e = dzsVar.e;
    }

    @Override // defpackage.dzu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dzu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dzu
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.dzu
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        sb.append(", flags=");
        sb.append(1 != this.c ? CloudRecognizerProtocolStrings.DBG_VALUE : "FLAG_CONVERT_TO_PLAIN_TEXT");
        Uri uri = this.d;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
