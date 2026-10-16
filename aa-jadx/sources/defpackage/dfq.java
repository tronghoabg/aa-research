package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dfq {
    public final boolean a = false;
    public final int b = 0;

    public dfq() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfq)) {
            return false;
        }
        defpackage.dfq dfqVar = (defpackage.dfq) obj;
        boolean z = dfqVar.a;
        int i = dfqVar.b;
        return true;
    }

    public final int hashCode() {
        return 38347;
    }

    public final java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=false, emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public dfq(byte[] bArr) {
    }
}
