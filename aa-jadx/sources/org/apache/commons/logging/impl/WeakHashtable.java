package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class WeakHashtable extends java.util.Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final java.lang.ref.ReferenceQueue queue = new java.lang.ref.ReferenceQueue();
    private int changeCount = 0;

    private void purge() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.queue) {
            while (true) {
                org.apache.commons.logging.impl.WeakHashtable.WeakKey weakKey = (org.apache.commons.logging.impl.WeakHashtable.WeakKey) this.queue.poll();
                if (weakKey == null) {
                    break;
                } else {
                    arrayList.add(weakKey.getReferenced());
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.remove(arrayList.get(i));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            org.apache.commons.logging.impl.WeakHashtable.WeakKey weakKey = (org.apache.commons.logging.impl.WeakHashtable.WeakKey) this.queue.poll();
            if (weakKey != null) {
                super.remove(weakKey.getReferenced());
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return super.containsKey(new org.apache.commons.logging.impl.WeakHashtable.Referenced(obj, (org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public java.util.Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public java.util.Set entrySet() {
        purge();
        java.util.Set<java.util.Map.Entry> setBridge_synchronizedSet = j$.util.DesugarCollections.bridge_synchronizedSet(super.entrySet(), this);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : setBridge_synchronizedSet) {
            java.lang.Object value = ((org.apache.commons.logging.impl.WeakHashtable.Referenced) entry.getKey()).getValue();
            java.lang.Object value2 = entry.getValue();
            if (value != null) {
                hashSet.add(new org.apache.commons.logging.impl.WeakHashtable.Entry(value, value2, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return super.get(new org.apache.commons.logging.impl.WeakHashtable.Referenced(obj, (org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public java.util.Set keySet() {
        purge();
        java.util.Set setBridge_synchronizedSet = j$.util.DesugarCollections.bridge_synchronizedSet(super.keySet(), this);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = setBridge_synchronizedSet.iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((org.apache.commons.logging.impl.WeakHashtable.Referenced) it.next()).getValue();
            if (value != null) {
                hashSet.add(value);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public java.util.Enumeration keys() {
        purge();
        return new java.util.Enumeration(this, super.keys()) { // from class: org.apache.commons.logging.impl.WeakHashtable.1
            private final org.apache.commons.logging.impl.WeakHashtable this$0;
            private final java.util.Enumeration val$enumer;

            {
                this.this$0 = this;
                this.val$enumer = enumeration;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.val$enumer.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                return ((org.apache.commons.logging.impl.WeakHashtable.Referenced) this.val$enumer.nextElement()).getValue();
            }
        };
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        try {
            if (obj == null) {
                throw new java.lang.NullPointerException("Null keys are not allowed");
            }
            if (obj2 == null) {
                throw new java.lang.NullPointerException("Null values are not allowed");
            }
            int i = this.changeCount;
            int i2 = i + 1;
            this.changeCount = i2;
            if (i > MAX_CHANGES_BEFORE_PURGE) {
                purge();
                this.changeCount = 0;
            } else if (i2 % 10 == 0) {
                purgeOne();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return super.put(new org.apache.commons.logging.impl.WeakHashtable.Referenced(obj, this.queue, null), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(java.util.Map map) {
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    protected void rehash() {
        purge();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        int i = this.changeCount;
        int i2 = i + 1;
        this.changeCount = i2;
        if (i > MAX_CHANGES_BEFORE_PURGE) {
            purge();
            this.changeCount = 0;
        } else if (i2 % 10 == 0) {
            purgeOne();
        }
        return super.remove(new org.apache.commons.logging.impl.WeakHashtable.Referenced(obj, (org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public java.lang.String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public java.util.Collection values() {
        purge();
        return j$.util.DesugarCollections.bridge_synchronizedCollection(super.values(), this);
    }

    private static final class WeakKey extends java.lang.ref.WeakReference {
        private final org.apache.commons.logging.impl.WeakHashtable.Referenced referenced;

        private WeakKey(java.lang.Object obj, java.lang.ref.ReferenceQueue referenceQueue, org.apache.commons.logging.impl.WeakHashtable.Referenced referenced) {
            super(obj, referenceQueue);
            this.referenced = referenced;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.apache.commons.logging.impl.WeakHashtable.Referenced getReferenced() {
            return this.referenced;
        }

        public WeakKey(java.lang.Object obj, java.lang.ref.ReferenceQueue referenceQueue, org.apache.commons.logging.impl.WeakHashtable.Referenced referenced, org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1 anonymousClass1) {
            this(obj, referenceQueue, referenced);
        }
    }

    private static final class Entry implements java.util.Map.Entry {
        private final java.lang.Object key;
        private final java.lang.Object value;

        private Entry(java.lang.Object obj, java.lang.Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (getKey() == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!getKey().equals(entry.getKey())) {
                return false;
            }
            if (getValue() == null) {
                return entry.getValue() == null;
            }
            return getValue().equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public Entry(java.lang.Object obj, java.lang.Object obj2, org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1 anonymousClass1) {
            this(obj, obj2);
        }
    }

    private static final class Referenced {
        private final int hashCode;
        private final java.lang.ref.WeakReference reference;

        private Referenced(java.lang.Object obj, java.lang.ref.ReferenceQueue referenceQueue) {
            this.reference = new org.apache.commons.logging.impl.WeakHashtable.WeakKey(obj, referenceQueue, this, null);
            this.hashCode = obj.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Object getValue() {
            return this.reference.get();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.apache.commons.logging.impl.WeakHashtable.Referenced)) {
                return false;
            }
            org.apache.commons.logging.impl.WeakHashtable.Referenced referenced = (org.apache.commons.logging.impl.WeakHashtable.Referenced) obj;
            java.lang.Object value = getValue();
            java.lang.Object value2 = referenced.getValue();
            if (value == null) {
                return value2 == null && hashCode() == referenced.hashCode();
            }
            return value.equals(value2);
        }

        public int hashCode() {
            return this.hashCode;
        }

        private Referenced(java.lang.Object obj) {
            this.reference = new java.lang.ref.WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        public Referenced(java.lang.Object obj, java.lang.ref.ReferenceQueue referenceQueue, org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1 anonymousClass1) {
            this(obj, referenceQueue);
        }

        public Referenced(java.lang.Object obj, org.apache.commons.logging.impl.WeakHashtable.AnonymousClass1 anonymousClass1) {
            this(obj);
        }
    }
}
