package defpackage;

import j$.util.Objects;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class gdy extends eqj implements gdx {
    public static gdy a;
    public final String i;
    public final String j;
    private final StringBuilder n = new StringBuilder();
    public final String k = "Input";
    public final LinkedHashMap h = new LinkedHashMap();
    public boolean l = false;
    public boolean m = false;

    public gdy(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.gdx
    public final void a(String str) {
        if (((String) this.h.remove(str)) != null) {
            j(r());
        }
    }

    @Override // defpackage.gdx
    public final void b(String str, String str2) {
        this.h.put(str, str2);
        j(r());
    }

    public final CharSequence r() {
        StringBuilder sb = this.n;
        boolean z = false;
        sb.setLength(0);
        LinkedHashMap linkedHashMap = this.h;
        for (String str : linkedHashMap.keySet()) {
            if (!Objects.equals(str, this.k) || this.m) {
                if (z) {
                    sb.append("\n");
                }
                sb.append(str);
                sb.append(": ");
                sb.append((String) linkedHashMap.get(str));
                z = true;
            }
        }
        return sb.toString();
    }
}
