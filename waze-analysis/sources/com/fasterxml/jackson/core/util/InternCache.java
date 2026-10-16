package com.fasterxml.jackson.core.util;

import com.waze.strings.DisplayStrings;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache instance = new InternCache();
    private static final long serialVersionUID = 1;
    private final ReentrantLock lock;

    public InternCache(int i2, float f2, int i3) {
        super(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK, 0.8f, 4);
        this.lock = new ReentrantLock();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 280 && this.lock.tryLock()) {
            try {
                if (size() >= 280) {
                    clear();
                }
            } finally {
                this.lock.unlock();
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }

    public InternCache() {
        this(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK, 0.8f, 4);
    }
}
