.class public final LGe/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lae/g;

.field public final b:Ljava/util/LinkedHashMap;

.field public c:Z

.field public final d:LGe/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LGe/h;->b:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, LGe/g;

    .line 12
    .line 13
    invoke-direct {v0, p0}, LGe/g;-><init>(LGe/h;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LGe/h;->d:LGe/g;

    .line 17
    .line 18
    return-void
.end method
