.class public final Ls6/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/K0;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(LE5/L0;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, LE5/L0;->a:Ll8/K;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE5/K0;

    .line 11
    .line 12
    iput-object p1, p0, Ls6/r;->a:LE5/K0;

    .line 13
    .line 14
    iput p3, p0, Ls6/r;->b:I

    .line 15
    .line 16
    iput-object p4, p0, Ls6/r;->c:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method
