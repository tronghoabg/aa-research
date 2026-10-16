.class public final synthetic LU1/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/I;


# instance fields
.field public final synthetic a:LE5/n0;


# direct methods
.method public synthetic constructor <init>(LE5/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/I;->a:LE5/n0;

    return-void
.end method


# virtual methods
.method public final a(Lk2/a;LN1/N;)V
    .locals 0

    .line 1
    iget-object p1, p0, LU1/I;->a:LE5/n0;

    .line 2
    .line 3
    iget-object p1, p1, LE5/n0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LU1/z;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    iget-object p1, p1, LU1/z;->i:LQ1/s;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, LQ1/s;->d(I)V

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x16

    .line 14
    .line 15
    invoke-virtual {p1, p2}, LQ1/s;->e(I)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method
