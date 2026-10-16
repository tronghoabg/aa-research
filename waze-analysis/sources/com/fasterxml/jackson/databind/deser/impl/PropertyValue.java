package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    /* compiled from: WazeSource */
    final class Any extends PropertyValue {
        final SettableAnyProperty _property;
        final String _propertyName;

        public Any(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this._property = settableAnyProperty;
            this._propertyName = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) throws IOException {
            this._property.set(obj, this._propertyName, this.value);
        }
    }

    /* compiled from: WazeSource */
    final class AnyParameter extends PropertyValue {
        final SettableAnyProperty _property;
        final String _propertyName;

        public AnyParameter(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this._property = settableAnyProperty;
            this._propertyName = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void setValue(Object obj) throws IOException {
            this._property.set(obj, this._propertyName, this.value);
        }
    }

    /* compiled from: WazeSource */
    final class Map extends PropertyValue {
        final Object _key;

        public Map(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this._key = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
            ((java.util.Map) obj).put(this._key, this.value);
        }
    }

    /* compiled from: WazeSource */
    final class Regular extends PropertyValue {
        final SettableBeanProperty _property;

        public Regular(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this._property = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
            this._property.set(obj, this.value);
        }
    }

    protected PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }

    public abstract void assign(Object obj);

    public void setValue(Object obj) {
        throw new UnsupportedOperationException("Should not be called by this type ".concat(String.valueOf(getClass().getName())));
    }
}
