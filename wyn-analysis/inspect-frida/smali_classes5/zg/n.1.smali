.class public final Lzg/n;
.super Lzg/q;
.source "SourceFile"


# instance fields
.field public final d:Lzg/e;


# direct methods
.method public constructor <init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;Lzg/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lzg/q;-><init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lzg/n;->d:Lzg/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lzg/w;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lzg/n;->d:Lzg/e;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lzg/e;->e(Lzg/w;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
