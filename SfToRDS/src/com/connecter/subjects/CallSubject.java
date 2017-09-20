package com.connecter.subjects;

import com.connecter.observers.CallObserver;

public interface CallSubject<T> {
	public void registerObserver(CallObserver callObserver);
    public void removeObserver(CallObserver callObserver);
    public void notifyCallObservers();
}
