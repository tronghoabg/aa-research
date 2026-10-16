package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: A, reason: collision with root package name */
    public static final BillingResult f20128A;

    /* renamed from: B, reason: collision with root package name */
    public static final BillingResult f20129B;

    /* renamed from: C, reason: collision with root package name */
    public static final BillingResult f20130C;

    /* renamed from: D, reason: collision with root package name */
    public static final BillingResult f20131D;

    /* renamed from: a, reason: collision with root package name */
    public static final BillingResult f20132a = AbstractC3256n.c(3, "Google Play In-app Billing API version is less than 3");

    /* renamed from: b, reason: collision with root package name */
    public static final BillingResult f20133b = AbstractC3256n.c(3, "Google Play In-app Billing API version is less than 9");

    /* renamed from: c, reason: collision with root package name */
    public static final BillingResult f20134c = AbstractC3256n.c(3, "Billing service unavailable on device.");

    /* renamed from: d, reason: collision with root package name */
    public static final BillingResult f20135d = AbstractC3256n.c(5, "Client is already in the process of connecting to billing service.");

    /* renamed from: e, reason: collision with root package name */
    public static final BillingResult f20136e = AbstractC3256n.c(5, "The list of SKUs can't be empty.");

    /* renamed from: f, reason: collision with root package name */
    public static final BillingResult f20137f = AbstractC3256n.c(5, "SKU type can't be empty.");

    /* renamed from: g, reason: collision with root package name */
    public static final BillingResult f20138g = AbstractC3256n.c(5, "Product type can't be empty.");

    /* renamed from: h, reason: collision with root package name */
    public static final BillingResult f20139h = AbstractC3256n.c(-2, "Client does not support extra params.");

    /* renamed from: i, reason: collision with root package name */
    public static final BillingResult f20140i = AbstractC3256n.c(5, "Invalid purchase token.");

    /* renamed from: j, reason: collision with root package name */
    public static final BillingResult f20141j = AbstractC3256n.c(6, "An internal error occurred.");
    public static final BillingResult k;

    /* renamed from: l, reason: collision with root package name */
    public static final BillingResult f20142l;

    /* renamed from: m, reason: collision with root package name */
    public static final BillingResult f20143m;

    /* renamed from: n, reason: collision with root package name */
    public static final BillingResult f20144n;

    /* renamed from: o, reason: collision with root package name */
    public static final BillingResult f20145o;

    /* renamed from: p, reason: collision with root package name */
    public static final BillingResult f20146p;

    /* renamed from: q, reason: collision with root package name */
    public static final BillingResult f20147q;

    /* renamed from: r, reason: collision with root package name */
    public static final BillingResult f20148r;

    /* renamed from: s, reason: collision with root package name */
    public static final BillingResult f20149s;

    /* renamed from: t, reason: collision with root package name */
    public static final BillingResult f20150t;

    /* renamed from: u, reason: collision with root package name */
    public static final BillingResult f20151u;

    /* renamed from: v, reason: collision with root package name */
    public static final BillingResult f20152v;

    /* renamed from: w, reason: collision with root package name */
    public static final BillingResult f20153w;

    /* renamed from: x, reason: collision with root package name */
    public static final BillingResult f20154x;

    /* renamed from: y, reason: collision with root package name */
    public static final BillingResult f20155y;

    /* renamed from: z, reason: collision with root package name */
    public static final BillingResult f20156z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(5);
        builderNewBuilder.setDebugMessage("SKU can't be null.");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(0);
        k = builderNewBuilder2.build();
        f20142l = AbstractC3256n.c(-1, "Service connection is disconnected.");
        f20143m = AbstractC3256n.c(2, "Timeout communicating with service.");
        f20144n = AbstractC3256n.c(-2, "Client does not support subscriptions.");
        f20145o = AbstractC3256n.c(-2, "Client does not support subscriptions update.");
        f20146p = AbstractC3256n.c(-2, "Client does not support get purchase history.");
        f20147q = AbstractC3256n.c(-2, "Client does not support price change confirmation.");
        f20148r = AbstractC3256n.c(-2, "Play Store version installed does not support cross selling products.");
        f20149s = AbstractC3256n.c(-2, "Client does not support multi-item purchases.");
        f20150t = AbstractC3256n.c(-2, "Client does not support offer_id_token.");
        f20151u = AbstractC3256n.c(-2, "Client does not support ProductDetails.");
        f20152v = AbstractC3256n.c(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(-2);
        builderNewBuilder3.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(-2);
        builderNewBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        f20153w = builderNewBuilder4.build();
        f20154x = AbstractC3256n.c(5, "Unknown feature");
        f20155y = AbstractC3256n.c(-2, "Play Store version installed does not support get billing config.");
        f20156z = AbstractC3256n.c(-2, "Query product details with serialized docid is not supported.");
        f20128A = AbstractC3256n.c(4, "Item is unavailable for purchase.");
        f20129B = AbstractC3256n.c(-2, "Query product details with developer specified account is not supported.");
        f20130C = AbstractC3256n.c(-2, "Play Store version installed does not support alternative billing only.");
        f20131D = AbstractC3256n.c(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
    }

    public static BillingResult a(int i5, String str) {
        return AbstractC3256n.c(i5, str);
    }
}
