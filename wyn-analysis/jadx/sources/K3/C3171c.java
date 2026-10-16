package k3;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3646c;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3171c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39180b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3646c f39181c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.m f39182d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f39183e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f39184f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39185g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f39186h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f39187i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f39188j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f39189l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f39190m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f39191n;

    public C3171c(Context context, String str, InterfaceC3646c interfaceC3646c, h4.m migrationContainer, ArrayList arrayList, boolean z2, int i5, Executor queryExecutor, Executor transactionExecutor, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        AbstractC3340k.e(migrationContainer, "migrationContainer");
        AbstractC3256n.m(i5, "journalMode");
        AbstractC3340k.e(queryExecutor, "queryExecutor");
        AbstractC3340k.e(transactionExecutor, "transactionExecutor");
        AbstractC3340k.e(typeConverters, "typeConverters");
        AbstractC3340k.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f39179a = context;
        this.f39180b = str;
        this.f39181c = interfaceC3646c;
        this.f39182d = migrationContainer;
        this.f39183e = arrayList;
        this.f39184f = z2;
        this.f39185g = i5;
        this.f39186h = queryExecutor;
        this.f39187i = transactionExecutor;
        this.f39188j = z10;
        this.k = z11;
        this.f39189l = linkedHashSet;
        this.f39190m = typeConverters;
        this.f39191n = autoMigrationSpecs;
    }
}
