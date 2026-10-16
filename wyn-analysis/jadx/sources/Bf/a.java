package Bf;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1670a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f1671b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f1672c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f1673d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC3340k.d(charsetForName, "forName(...)");
        f1670a = charsetForName;
        AbstractC3340k.d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC3340k.d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC3340k.d(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC3340k.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        AbstractC3340k.d(charsetForName2, "forName(...)");
        f1671b = charsetForName2;
    }
}
