package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JDKValueInstantiators {

    /* compiled from: WazeSource */
    class ArrayListInstantiator extends JDKValueInstantiator {
        static final ArrayListInstantiator INSTANCE = new ArrayListInstantiator();
        private static final long serialVersionUID = 2;

        public ArrayListInstantiator() {
            super(ArrayList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new ArrayList();
        }
    }

    /* compiled from: WazeSource */
    class ConcurrentHashMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public ConcurrentHashMapInstantiator() {
            super(ConcurrentHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: WazeSource */
    class ConstantValueInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        protected final Object _value;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this._value = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object createUsingDefault(DeserializationContext deserializationContext) {
            return this._value;
        }
    }

    /* compiled from: WazeSource */
    class HashMapInstantiator extends JDKValueInstantiator {
        static final HashMapInstantiator INSTANCE = new HashMapInstantiator();
        private static final long serialVersionUID = 2;

        public HashMapInstantiator() {
            super(HashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new HashMap();
        }
    }

    /* compiled from: WazeSource */
    class HashSetInstantiator extends JDKValueInstantiator {
        static final HashSetInstantiator INSTANCE = new HashSetInstantiator();
        private static final long serialVersionUID = 2;

        public HashSetInstantiator() {
            super(HashSet.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new HashSet();
        }
    }

    /* compiled from: WazeSource */
    abstract class JDKValueInstantiator extends ValueInstantiator.Base implements Serializable {
        private static final long serialVersionUID = 2;

        public JDKValueInstantiator(Class<?> cls) {
            super(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean canInstantiate() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public abstract Object createUsingDefault(DeserializationContext deserializationContext);
    }

    /* compiled from: WazeSource */
    class LinkedHashMapInstantiator extends JDKValueInstantiator {
        static final LinkedHashMapInstantiator INSTANCE = new LinkedHashMapInstantiator();
        private static final long serialVersionUID = 2;

        public LinkedHashMapInstantiator() {
            super(LinkedHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new LinkedHashMap();
        }
    }

    /* compiled from: WazeSource */
    class LinkedListInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public LinkedListInstantiator() {
            super(LinkedList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new LinkedList();
        }
    }

    /* compiled from: WazeSource */
    class TreeMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public TreeMapInstantiator() {
            super(TreeMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new TreeMap();
        }
    }

    /* compiled from: WazeSource */
    class TreeSetInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public TreeSetInstantiator() {
            super(TreeSet.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.JDKValueInstantiator, com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) {
            return new TreeSet();
        }
    }

    public static ValueInstantiator findStdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.INSTANCE;
            }
            if (cls == HashSet.class) {
                return HashSetInstantiator.INSTANCE;
            }
            if (cls == LinkedList.class) {
                return new LinkedListInstantiator();
            }
            if (cls == TreeSet.class) {
                return new TreeSetInstantiator();
            }
            if (cls == Collections.EMPTY_SET.getClass()) {
                return new ConstantValueInstantiator(Collections.EMPTY_SET);
            }
            if (cls == Collections.EMPTY_LIST.getClass()) {
                return new ConstantValueInstantiator(Collections.EMPTY_LIST);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return LinkedHashMapInstantiator.INSTANCE;
        }
        if (cls == HashMap.class) {
            return HashMapInstantiator.INSTANCE;
        }
        if (cls == ConcurrentHashMap.class) {
            return new ConcurrentHashMapInstantiator();
        }
        if (cls == TreeMap.class) {
            return new TreeMapInstantiator();
        }
        if (cls == Collections.EMPTY_MAP.getClass()) {
            return new ConstantValueInstantiator(Collections.EMPTY_MAP);
        }
        return null;
    }
}
