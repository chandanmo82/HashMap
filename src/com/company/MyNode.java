package com.company;

    public class MyNode<K> implements INode<K> {
        public K key;
        public INode<K> next;

        public MyNode(K key){
            this.key = key;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        @Override
        public void setKey(K key) {
            this.key = key;
        }

        public INode<K> getNext() {
            return next;
        }

        public void setNext(INode next) {
            this.next = (INode<K>) next;
        }

    }

