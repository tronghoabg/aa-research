package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ajvu extends ajvh implements Serializable {
    private static final long serialVersionUID = -2845454858205884623L;
    public final Map b;
    private transient Charset c;

    public ajvu(Charset charset) {
        this.b = new HashMap();
        this.c = charset == null ? ajox.b : charset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Charset charsetA = ahkp.a(objectInputStream.readUTF());
        this.c = charsetA;
        if (charsetA == null) {
            this.c = ajox.b;
        }
        this.a = (ajqh) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.c.name());
        objectOutputStream.writeObject(this.a);
    }

    @Override // defpackage.ajpy
    public final String a() {
        return l("realm");
    }

    @Override // defpackage.ajvh
    protected final void h(akbh akbhVar, int i, int i2) throws ajpr, ajqm {
        ajzy[] ajzyVarArrB = akaa.a.b(akbhVar, new akao(i, akbhVar.b));
        Map map = this.b;
        map.clear();
        for (ajzy ajzyVar : ajzyVarArrB) {
            map.put(ajzyVar.a.toLowerCase(Locale.ROOT), ajzyVar.b);
        }
    }

    final String k(ajph ajphVar) {
        String str = (String) ajphVar.hX().a("http.auth.credential-charset");
        if (str != null) {
            return str;
        }
        Charset charset = this.c;
        if (charset == null) {
            charset = ajox.b;
        }
        return charset.name();
    }

    public final String l(String str) {
        return (String) this.b.get(str.toLowerCase(Locale.ROOT));
    }

    public ajvu() {
        this(ajox.b);
    }
}
