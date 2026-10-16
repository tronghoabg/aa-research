.class public final Lk2/T;
.super Ls2/r;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lk2/X;


# direct methods
.method public constructor <init>(Lk2/X;Ls2/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/T;->b:Lk2/X;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls2/r;-><init>(Ls2/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/T;->b:Lk2/X;

    .line 2
    .line 3
    iget-wide v0, v0, Lk2/X;->B:J

    .line 4
    .line 5
    return-wide v0
.end method
