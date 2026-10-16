.class public final LGd/g;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LEf/E;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LS3/s;

.field public d:I


# direct methods
.method public constructor <init>(LS3/s;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LGd/g;->c:LS3/s;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LGd/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LGd/g;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LGd/g;->d:I

    .line 9
    .line 10
    iget-object p1, p0, LGd/g;->c:LS3/s;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
