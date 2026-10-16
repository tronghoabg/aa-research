.class public final LC8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls8/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LC8/c;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, LC8/c;->b:Ls8/j;

    .line 10
    .line 11
    return-void
.end method

.method public static a(LC8/b;)LC8/c;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LC8/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iget-object p0, p0, LC8/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, LC8/c;-><init>(Ljava/lang/String;Ls8/j;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
