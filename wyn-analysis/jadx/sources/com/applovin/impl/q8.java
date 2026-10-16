package com.applovin.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q8 {

    /* renamed from: f, reason: collision with root package name */
    public static final q8 f22627f = new q8();

    /* renamed from: a, reason: collision with root package name */
    private final q8 f22628a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22629b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f22630c;

    /* renamed from: d, reason: collision with root package name */
    protected String f22631d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f22632e;

    public q8(String str, Map map, q8 q8Var) {
        this.f22628a = q8Var;
        this.f22629b = str;
        this.f22630c = DesugarCollections.unmodifiableMap(map);
        this.f22632e = new ArrayList();
    }

    public Map a() {
        return this.f22630c;
    }

    public List b() {
        return DesugarCollections.unmodifiableList(this.f22632e);
    }

    public String c() {
        return this.f22629b;
    }

    public String d() {
        return this.f22631d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f22629b + "', text='" + this.f22631d + "', attributes=" + this.f22630c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f22632e.size());
        for (q8 q8Var : this.f22632e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                arrayList.add(q8Var);
            }
        }
        return arrayList;
    }

    public q8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f22632e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            q8 q8Var = (q8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
            arrayList.addAll(q8Var.b());
        }
        return null;
    }

    public q8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (q8 q8Var : this.f22632e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
        }
        return null;
    }

    private q8() {
        this.f22628a = null;
        this.f22629b = "";
        this.f22630c = Collections.EMPTY_MAP;
        this.f22631d = "";
        this.f22632e = Collections.EMPTY_LIST;
    }
}
