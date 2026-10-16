package k8;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: k8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3198g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f39299a = StandardCharsets.US_ASCII;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f39300b = StandardCharsets.ISO_8859_1;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f39301c = StandardCharsets.UTF_8;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f39302d;

    static {
        Charset charset = StandardCharsets.UTF_16BE;
        Charset charset2 = StandardCharsets.UTF_16LE;
        f39302d = StandardCharsets.UTF_16;
    }
}
