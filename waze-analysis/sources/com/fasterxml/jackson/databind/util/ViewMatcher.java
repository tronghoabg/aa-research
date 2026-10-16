package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();
    private static final long serialVersionUID = 1;

    /* compiled from: WazeSource */
    final class Multi extends ViewMatcher implements Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?>[] _views;

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this._views.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls2 = this._views[i2];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    final class Single extends ViewMatcher {
        private static final long serialVersionUID = 1;
        private final Class<?> _view;

        public Single(Class<?> cls) {
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        int length;
        return (clsArr == null || (length = clsArr.length) == 0) ? EMPTY : length != 1 ? new Multi(clsArr) : new Single(clsArr[0]);
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
