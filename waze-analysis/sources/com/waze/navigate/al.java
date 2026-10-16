package com.waze.navigate;

import j$.util.Objects;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al implements Comparator {
    al(AutocompleteSearchActivity autocompleteSearchActivity) {
        Objects.requireNonNull(autocompleteSearchActivity);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int type = ((AddressItem) obj).getType();
        if (type == ((AddressItem) obj2).getType()) {
            return 0;
        }
        return type == 8 ? -1 : 1;
    }
}
