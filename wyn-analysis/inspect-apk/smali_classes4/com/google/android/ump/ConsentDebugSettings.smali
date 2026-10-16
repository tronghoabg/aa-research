.class public Lcom/google/android/ump/ConsentDebugSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/ump/ConsentDebugSettings$Builder;,
        Lcom/google/android/ump/ConsentDebugSettings$DebugGeography;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method public synthetic constructor <init>(ZLcom/google/android/ump/ConsentDebugSettings$Builder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/google/android/ump/ConsentDebugSettings;->a:Z

    .line 5
    .line 6
    iget p1, p2, Lcom/google/android/ump/ConsentDebugSettings$Builder;->c:I

    .line 7
    .line 8
    iput p1, p0, Lcom/google/android/ump/ConsentDebugSettings;->b:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getDebugGeography()I
    .locals 1

    iget v0, p0, Lcom/google/android/ump/ConsentDebugSettings;->b:I

    return v0
.end method

.method public isTestDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/ump/ConsentDebugSettings;->a:Z

    return v0
.end method
