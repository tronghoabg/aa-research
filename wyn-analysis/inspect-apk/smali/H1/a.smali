.class public final LH1/a;
.super LH1/b;
.source "SourceFile"


# static fields
.field public static final b:LH1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH1/a;

    .line 2
    .line 3
    invoke-direct {v0}, LH1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH1/a;->b:LH1/a;

    .line 7
    .line 8
    return-void
.end method
