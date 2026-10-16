package i.b.g;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m implements eg {
    link(0),
    content(1),
    securedLink(2),
    data(3),
    text(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48463g;

    m(int i2) {
        this.f48463g = i2;
    }

    public static m a(int i2) {
        if (i2 == 0) {
            return link;
        }
        if (i2 == 1) {
            return content;
        }
        if (i2 == 2) {
            return securedLink;
        }
        if (i2 == 3) {
            return data;
        }
        if (i2 != 4) {
            return null;
        }
        return text;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48463g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48463g);
    }
}
