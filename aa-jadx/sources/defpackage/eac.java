package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eac implements defpackage.eab {
    private final android.content.ClipData a;
    private final int b;
    private final int c;
    private final android.net.Uri d;
    private final android.os.Bundle e;

    public eac(defpackage.dzz dzzVar) {
        android.content.ClipData clipData = dzzVar.a;
        defpackage.ebl.q(clipData);
        this.a = clipData;
        this.b = dzzVar.b;
        this.c = dzzVar.c;
        this.d = dzzVar.d;
        this.e = dzzVar.e;
    }

    @Override // defpackage.eab
    public final int a() {
        return this.c;
    }

    @Override // defpackage.eab
    public final int b() {
        return this.b;
    }

    @Override // defpackage.eab
    public final android.content.ClipData c() {
        return this.a;
    }

    @Override // defpackage.eab
    public final android.view.ContentInfo d() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD";
        } else {
            str = "SOURCE_CLIPBOARD";
        }
        sb.append(str);
        sb.append(", flags=");
        sb.append(1 != this.c ? com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE : "FLAG_CONVERT_TO_PLAIN_TEXT");
        android.net.Uri uri = this.d;
        if (uri == null) {
            str2 = "";
        } else {
            str2 = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str2);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
