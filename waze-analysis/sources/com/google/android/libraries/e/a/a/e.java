package com.google.android.libraries.e.a.a;

import android.accounts.Account;
import android.content.Context;
import androidx.credentials.CreateDigitalCredentialRequest;
import com.google.android.gms.o.ag;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5822b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f5823c = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* renamed from: a, reason: collision with root package name */
    static final Account f5821a = a.f5809a;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f5824d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("default", CreateDigitalCredentialRequest.UNUSED_USER_ID, "special", "reserved", "shared", "virtual", "managed")));

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
    }

    public static d a(Context context) {
        return new d(context);
    }

    static void b() {
        ag.i(f5823c.matcher("phenotype").matches(), "Module must match [a-z]+(_[a-z]+)*: %s", "phenotype");
        ag.i(!f5824d.contains("phenotype"), "Module name is reserved and cannot be used: %s", "phenotype");
    }
}
